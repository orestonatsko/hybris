/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at May 30, 2019 2:56:19 AM                     ---
 * ----------------------------------------------------------------
 */
package org.oorextension.jalo;

import de.hybris.platform.core.PK;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.processengine.jalo.BusinessProcess;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.oorextension.constants.OorextensionConstants;

/**
 * Generated class for type {@link org.oorextension.jalo.BusinessProcessStatusProduct BusinessProcessStatusProduct}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedBusinessProcessStatusProduct extends BusinessProcess
{
	/** Qualifier of the <code>BusinessProcessStatusProduct.productStatusPk</code> attribute **/
	public static final String PRODUCTSTATUSPK = "productStatusPk";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(BusinessProcess.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(PRODUCTSTATUSPK, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessProcessStatusProduct.productStatusPk</code> attribute.
	 * @return the productStatusPk
	 */
	public PK getProductStatusPk(final SessionContext ctx)
	{
		return (PK)getProperty( ctx, PRODUCTSTATUSPK);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>BusinessProcessStatusProduct.productStatusPk</code> attribute.
	 * @return the productStatusPk
	 */
	public PK getProductStatusPk()
	{
		return getProductStatusPk( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessProcessStatusProduct.productStatusPk</code> attribute. 
	 * @param value the productStatusPk
	 */
	public void setProductStatusPk(final SessionContext ctx, final PK value)
	{
		setProperty(ctx, PRODUCTSTATUSPK,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>BusinessProcessStatusProduct.productStatusPk</code> attribute. 
	 * @param value the productStatusPk
	 */
	public void setProductStatusPk(final PK value)
	{
		setProductStatusPk( getSession().getSessionContext(), value );
	}
	
}
