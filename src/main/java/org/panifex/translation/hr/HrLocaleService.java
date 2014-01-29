/*******************************************************************************
 * Panifex platform
 * Copyright (C) 2013  Mario Krizmanic
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 ******************************************************************************/
package org.panifex.translation.hr;

import java.util.Locale;

import org.apache.aries.blueprint.annotation.Bean;
import org.apache.aries.blueprint.annotation.Inject;
import org.apache.aries.blueprint.annotation.Service;
import org.osgi.framework.BundleContext;
import org.panifex.module.api.i18n.AbstractLocaleService;
import org.panifex.module.api.i18n.LocaleService;

/**
 * Registers the Croatian translation.
 */
@Bean(id = HrLocaleService.ID)
@Service(interfaces = LocaleService.class)
public final class HrLocaleService extends AbstractLocaleService {

    public static final String ID = "org.panifex.translation.hr.HrLocaleService";
    
    @Inject(ref = "blueprintBundleContext")
    private BundleContext bundleContext;
    
    public HrLocaleService() {
        super(new Locale("hr"));
        addResource("/i18n/common-labels.properties");
    }
    
    @Override
    public final void setBundleContext(BundleContext bundleContext) {
       setBundleContext0(bundleContext);
    }
}
