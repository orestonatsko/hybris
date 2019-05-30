/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 30, 2019 2:56:19 AM                     ---
 * ----------------------------------------------------------------
 */
package org.oorextension.jalo;

import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;
import org.oorextension.constants.OorextensionConstants;
import org.oorextension.jalo.Author;
import org.oorextension.jalo.Book;
import org.oorextension.jalo.BusinessProcessStatusProduct;
import org.oorextension.jalo.StatusProduct;
import org.oorextension.jalo.cronjob.SynchronizingCronJob;

/**
 * Generated class for type <code>OorextensionManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOorextensionManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public Author createAuthor(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OorextensionConstants.TC.AUTHOR );
			return (Author)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Author : "+e.getMessage(), 0 );
		}
	}
	
	public Author createAuthor(final Map attributeValues)
	{
		return createAuthor( getSession().getSessionContext(), attributeValues );
	}
	
	public Book createBook(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OorextensionConstants.TC.BOOK );
			return (Book)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Book : "+e.getMessage(), 0 );
		}
	}
	
	public Book createBook(final Map attributeValues)
	{
		return createBook( getSession().getSessionContext(), attributeValues );
	}
	
	public BusinessProcessStatusProduct createBusinessProcessStatusProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OorextensionConstants.TC.BUSINESSPROCESSSTATUSPRODUCT );
			return (BusinessProcessStatusProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating BusinessProcessStatusProduct : "+e.getMessage(), 0 );
		}
	}
	
	public BusinessProcessStatusProduct createBusinessProcessStatusProduct(final Map attributeValues)
	{
		return createBusinessProcessStatusProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public StatusProduct createMyStatusProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OorextensionConstants.TC.MYSTATUSPRODUCT );
			return (StatusProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating MyStatusProduct : "+e.getMessage(), 0 );
		}
	}
	
	public StatusProduct createMyStatusProduct(final Map attributeValues)
	{
		return createMyStatusProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public SynchronizingCronJob createSynchronizingCronJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( OorextensionConstants.TC.SYNCHRONIZINGCRONJOB );
			return (SynchronizingCronJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating SynchronizingCronJob : "+e.getMessage(), 0 );
		}
	}
	
	public SynchronizingCronJob createSynchronizingCronJob(final Map attributeValues)
	{
		return createSynchronizingCronJob( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return OorextensionConstants.EXTENSIONNAME;
	}
	
}
