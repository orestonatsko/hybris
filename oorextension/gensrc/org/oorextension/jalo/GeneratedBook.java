/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 30, 2019 2:56:19 AM                     ---
 * ----------------------------------------------------------------
 */
package org.oorextension.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.oorextension.constants.OorextensionConstants;
import org.oorextension.jalo.Author;

/**
 * Generated class for type {@link org.oorextension.jalo.Book Book}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBook extends GenericItem
{
	/** Qualifier of the <code>Book.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Book.genre</code> attribute **/
	public static final String GENRE = "genre";
	/** Qualifier of the <code>Book.publishingHouse</code> attribute **/
	public static final String PUBLISHINGHOUSE = "publishingHouse";
	/** Qualifier of the <code>Book.basePrice</code> attribute **/
	public static final String BASEPRICE = "basePrice";
	/** Qualifier of the <code>Book.fullPrice</code> attribute **/
	public static final String FULLPRICE = "fullPrice";
	/** Qualifier of the <code>Book.author</code> attribute **/
	public static final String AUTHOR = "author";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n AUTHOR's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedBook> AUTHORHANDLER = new BidirectionalOneToManyHandler<GeneratedBook>(
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
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(GENRE, AttributeMode.INITIAL);
		tmp.put(PUBLISHINGHOUSE, AttributeMode.INITIAL);
		tmp.put(BASEPRICE, AttributeMode.INITIAL);
		tmp.put(FULLPRICE, AttributeMode.INITIAL);
		tmp.put(AUTHOR, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.author</code> attribute.
	 * @return the author
	 */
	public Author getAuthor(final SessionContext ctx)
	{
		return (Author)getProperty( ctx, AUTHOR);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.author</code> attribute.
	 * @return the author
	 */
	public Author getAuthor()
	{
		return getAuthor( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.author</code> attribute. 
	 * @param value the author
	 */
	public void setAuthor(final SessionContext ctx, final Author value)
	{
		AUTHORHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.author</code> attribute. 
	 * @param value the author
	 */
	public void setAuthor(final Author value)
	{
		setAuthor( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.basePrice</code> attribute.
	 * @return the basePrice
	 */
	public BigDecimal getBasePrice(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, BASEPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.basePrice</code> attribute.
	 * @return the basePrice
	 */
	public BigDecimal getBasePrice()
	{
		return getBasePrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.basePrice</code> attribute. 
	 * @param value the basePrice
	 */
	public void setBasePrice(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, BASEPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.basePrice</code> attribute. 
	 * @param value the basePrice
	 */
	public void setBasePrice(final BigDecimal value)
	{
		setBasePrice( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		AUTHORHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.fullPrice</code> attribute.
	 * @return the fullPrice
	 */
	public BigDecimal getFullPrice(final SessionContext ctx)
	{
		return (BigDecimal)getProperty( ctx, FULLPRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.fullPrice</code> attribute.
	 * @return the fullPrice
	 */
	public BigDecimal getFullPrice()
	{
		return getFullPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.fullPrice</code> attribute. 
	 * @param value the fullPrice
	 */
	public void setFullPrice(final SessionContext ctx, final BigDecimal value)
	{
		setProperty(ctx, FULLPRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.fullPrice</code> attribute. 
	 * @param value the fullPrice
	 */
	public void setFullPrice(final BigDecimal value)
	{
		setFullPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.genre</code> attribute.
	 * @return the genre
	 */
	public EnumerationValue getGenre(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, GENRE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.genre</code> attribute.
	 * @return the genre
	 */
	public EnumerationValue getGenre()
	{
		return getGenre( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.genre</code> attribute. 
	 * @param value the genre
	 */
	public void setGenre(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, GENRE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.genre</code> attribute. 
	 * @param value the genre
	 */
	public void setGenre(final EnumerationValue value)
	{
		setGenre( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.publishingHouse</code> attribute.
	 * @return the publishingHouse
	 */
	public EnumerationValue getPublishingHouse(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PUBLISHINGHOUSE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Book.publishingHouse</code> attribute.
	 * @return the publishingHouse
	 */
	public EnumerationValue getPublishingHouse()
	{
		return getPublishingHouse( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.publishingHouse</code> attribute. 
	 * @param value the publishingHouse
	 */
	public void setPublishingHouse(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PUBLISHINGHOUSE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Book.publishingHouse</code> attribute. 
	 * @param value the publishingHouse
	 */
	public void setPublishingHouse(final EnumerationValue value)
	{
		setPublishingHouse( getSession().getSessionContext(), value );
	}
	
}
