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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.oorextension.constants.OorextensionConstants;

/**
 * Generated class for type {@link org.oorextension.jalo.StatusProduct MyStatusProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedStatusProduct extends GenericItem
{
	/** Qualifier of the <code>MyStatusProduct.synchronized</code> attribute **/
	public static final String SYNCHRONIZED = "synchronized";
	/** Qualifier of the <code>MyStatusProduct.status</code> attribute **/
	public static final String STATUS = "status";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(SYNCHRONIZED, AttributeMode.INITIAL);
		tmp.put(STATUS, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyStatusProduct.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, STATUS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyStatusProduct.status</code> attribute.
	 * @return the status
	 */
	public EnumerationValue getStatus()
	{
		return getStatus( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyStatusProduct.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, STATUS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyStatusProduct.status</code> attribute. 
	 * @param value the status
	 */
	public void setStatus(final EnumerationValue value)
	{
		setStatus( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyStatusProduct.synchronized</code> attribute.
	 * @return the synchronized
	 */
	public Boolean isSynchronized(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, SYNCHRONIZED);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyStatusProduct.synchronized</code> attribute.
	 * @return the synchronized
	 */
	public Boolean isSynchronized()
	{
		return isSynchronized( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyStatusProduct.synchronized</code> attribute. 
	 * @return the synchronized
	 */
	public boolean isSynchronizedAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isSynchronized( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MyStatusProduct.synchronized</code> attribute. 
	 * @return the synchronized
	 */
	public boolean isSynchronizedAsPrimitive()
	{
		return isSynchronizedAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyStatusProduct.synchronized</code> attribute. 
	 * @param value the synchronized
	 */
	public void setSynchronized(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, SYNCHRONIZED,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyStatusProduct.synchronized</code> attribute. 
	 * @param value the synchronized
	 */
	public void setSynchronized(final Boolean value)
	{
		setSynchronized( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyStatusProduct.synchronized</code> attribute. 
	 * @param value the synchronized
	 */
	public void setSynchronized(final SessionContext ctx, final boolean value)
	{
		setSynchronized( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MyStatusProduct.synchronized</code> attribute. 
	 * @param value the synchronized
	 */
	public void setSynchronized(final boolean value)
	{
		setSynchronized( getSession().getSessionContext(), value );
	}
	
}
