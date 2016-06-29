/*
 * Copyright (C) 2016 Code Dx, Inc. - http://www.codedx.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.zaproxy.zap.extension.codedx;

import org.parosproxy.paros.extension.report.ReportLastScan;
import org.parosproxy.paros.model.SiteNode;

public class ReportLastScanHttp extends ReportLastScan {

	ReportLastScanHttp() {
	}

	@Override
	public StringBuilder getExtensionsXML(SiteNode site) {
		return new StringBuilder(new ExtensionAlertHttp().getXml(site));
	}

}