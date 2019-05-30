package org.oorextension.controller;

import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.processengine.BusinessProcessService;
import de.hybris.platform.servicelayer.cronjob.CronJobService;
import de.hybris.platform.servicelayer.model.ModelService;
import org.oorextension.data.AuthorData;
import org.oorextension.facade.AuthorFacade;
import org.oorextension.model.cronjob.SynchronizingCronJobModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/authors")
public class AuthorController {

    private AuthorFacade authorFacade;

    private final
    BusinessProcessService businessProcess;

    private ModelService modelService;
    private CronJobService cronJobService;


    @Autowired
    public AuthorController(AuthorFacade authorFacade, BusinessProcessService businessProcess, ModelService modelService, CronJobService cronJobService) {
        this.authorFacade = authorFacade;
        this.businessProcess = businessProcess;
        this.modelService = modelService;
        this.cronJobService = cronJobService;
    }

    @GetMapping({"", "/"})
    public String showAllAuthors(Model model) {
        List<AuthorData> authors = authorFacade.getAllAuthors();
        model.addAttribute("authors", authors);
        return "authors";
    }

    @PostMapping("/show")
    public String saveAuthor(@ModelAttribute AuthorData authorData, Model model) throws Exception {
        AuthorData savedAuthorData = authorFacade.saveAuthor(authorData);

        model.addAttribute("author", savedAuthorData);

        return "authorshow";
    }


    @GetMapping("/add")
    public String addAuthor(Model model) {
        model.addAttribute("author", new AuthorData());

        return "authorform";
    }

    @RequestMapping("/start")
    public String startProcess() {
       modelService.save(businessProcess.startProcess("synchronizingProcess-[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) +"]",
               "testSynchronizing-process"));

        return "synchronizing";
    }
}