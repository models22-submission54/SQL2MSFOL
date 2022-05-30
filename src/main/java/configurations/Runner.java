package configurations;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import datamodel.DataModelUtils;
import sql2msfol.SQL2MSFOL;

/**************************************************************************
 * Copyright 2020 Vietnamese-German-University
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * @author: ngpbh
 ***************************************************************************/

public class Runner {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException, Exception {
		Configuration c = new Configuration();

		SQL2MSFOL sql2msfol = new SQL2MSFOL();
		sql2msfol.setUpDataModelFromURL(c.getDataModel());
		DataModelUtils.setDataModel(sql2msfol.getDataModel());
		DataModelUtils.setContext(c.getContext());
		sql2msfol.map(c.getSql());

	}
}
