/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.iot.transform.v20170420;

import com.aliyuncs.iot.model.v20170420.QueryDevicePropResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDevicePropResponseUnmarshaller {

	public static QueryDevicePropResponse unmarshall(QueryDevicePropResponse queryDevicePropResponse, UnmarshallerContext context) {
		
		queryDevicePropResponse.setRequestId(context.stringValue("QueryDevicePropResponse.RequestId"));
		queryDevicePropResponse.setSuccess(context.booleanValue("QueryDevicePropResponse.Success"));
		queryDevicePropResponse.setErrorMessage(context.stringValue("QueryDevicePropResponse.ErrorMessage"));
		queryDevicePropResponse.setProps(context.stringValue("QueryDevicePropResponse.Props"));
	 
	 	return queryDevicePropResponse;
	}
}