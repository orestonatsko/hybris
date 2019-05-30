/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 30, 2019 2:56:19 AM                     ---
 * ----------------------------------------------------------------
 */
package org.oorextension.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.oorextension.constants.OorextensionConstants;
import org.oorextension.jalo.Book;

/**
 * Generated class for type {@link org.oorextension.jalo.Author Author}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedAuthor extends GenericItem
{
	/** Qualifier of the <code>Author.firstName</code> attribute **/
	public static final String FIRSTNAME = "firstName";
	/** Qualifier of the <code>Author.lastName</code> attribute **/
	public static final String LASTNAME = "lastName";
	/** Qualifier of the <code>Author.genre</code> attribute **/
	public static final String GENRE = "genre";
	/** Qualifier of the <code>Author.books</code> attribute **/
	public static final String BOOKS = "books";
	/**
	* {@link OneToManyHandler} for handling 1:n BOOKS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Book> BOOKSHANDLER = new OneToManyHandler<Book>(
	OorextensionConstants.TC.BOOK,
	false,
	"author",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(FIRSTNAME, AttributeMode.INITIAL);
		tmp.put(LASTNAME, AttributeMode.INITIAL);
		tmp.put(GENRE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.books</code> attribute.
	 * @return the books
	 */
	public Collection<Book> getBooks(final SessionContext ctx)
	{
		return BOOKSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.books</code> attribute.
	 * @return the books
	 */
	public Collection<Book> getBooks()
	{
		return getBooks( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.books</code> attribute. 
	 * @param value the books
	 */
	public void setBooks(final SessionContext ctx, final Collection<Book> value)
	{
		BOOKSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.books</code> attribute. 
	 * @param value the books
	 */
	public void setBooks(final Collection<Book> value)
	{
		setBooks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to books. 
	 * @param value the item to add to books
	 */
	public void addToBooks(final SessionContext ctx, final Book value)
	{
		BOOKSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to books. 
	 * @param value the item to add to books
	 */
	public void addToBooks(final Book value)
	{
		addToBooks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from books. 
	 * @param value the item to remove from books
	 */
	public void removeFromBooks(final SessionContext ctx, final Book value)
	{
		BOOKSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from books. 
	 * @param value the item to remove from books
	 */
	public void removeFromBooks(final Book value)
	{
		removeFromBooks( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, FIRSTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.firstName</code> attribute.
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return getFirstName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, FIRSTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.firstName</code> attribute. 
	 * @param value the firstName
	 */
	public void setFirstName(final String value)
	{
		setFirstName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.genre</code> attribute.
	 * @return the genre
	 */
	public EnumerationValue getGenre(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, GENRE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.genre</code> attribute.
	 * @return the genre
	 */
	public EnumerationValue getGenre()
	{
		return getGenre( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.genre</code> attribute. 
	 * @param value the genre
	 */
	public void setGenre(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, GENRE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.genre</code> attribute. 
	 * @param value the genre
	 */
	public void setGenre(final EnumerationValue value)
	{
		setGenre( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LASTNAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Author.lastName</code> attribute.
	 * @return the lastName
	 */
	public String getLastName()
	{
		return getLastName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LASTNAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Author.lastName</code> attribute. 
	 * @param value the lastName
	 */
	public void setLastName(final String value)
	{
		setLastName( getSession().getSessionContext(), value );
	}
	
}
