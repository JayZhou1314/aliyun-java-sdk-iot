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

import com.aliyuncs.iot.model.v20170420.QueryApplyStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryApplyStatusResponseUnmarshaller {

	public static QueryApplyStatusResponse unmarshall(QueryApplyStatusResponse queryApplyStatusResponse, UnmarshallerContext context) {
		
		queryApplyStatusResponse.setRequestId(context.stringValue("QueryApplyStatusResponse.RequestId"));
		queryApplyStatusResponse.setSuccess(context.booleanValue("QueryApplyStatusResponse.Success"));
		queryApplyStatusResponse.setErrorMessage(context.stringValue("QueryApplyStatusResponse.ErrorMessage"));
		queryApplyStatusResponse.setFinish(context.booleanValue("QueryApplyStatusResponse.Finish"));
	 
	 	return queryApplyStatusResponse;
	}
}