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

package com.aliyuncs.iot.model.v20170420;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteRuleActionRequest extends RpcAcsRequest<DeleteRuleActionResponse> {
	
	public DeleteRuleActionRequest() {
		super("Iot", "2017-04-20", "DeleteRuleAction");
	}

	private Long actionId;

	public Long getActionId() {
		return this.actionId;
	}

	public void setActionId(Long actionId) {
		this.actionId = actionId;
		if(actionId != null){
			putQueryParameter("ActionId", actionId.toString());
		}
	}

	@Override
	public Class<DeleteRuleActionResponse> getResponseClass() {
		return DeleteRuleActionResponse.class;
	}

}
