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
public class UpdateRuleRequest extends RpcAcsRequest<UpdateRuleResponse> {
	
	public UpdateRuleRequest() {
		super("Iot", "2017-04-20", "UpdateRule");
	}

	private String select;

	private String ruleDesc;

	private String name;

	private String where;

	private Long ruleId;

	private String productKey;

	private String shortTopic;

	public String getSelect() {
		return this.select;
	}

	public void setSelect(String select) {
		this.select = select;
		if(select != null){
			putQueryParameter("Select", select);
		}
	}

	public String getRuleDesc() {
		return this.ruleDesc;
	}

	public void setRuleDesc(String ruleDesc) {
		this.ruleDesc = ruleDesc;
		if(ruleDesc != null){
			putQueryParameter("RuleDesc", ruleDesc);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getWhere() {
		return this.where;
	}

	public void setWhere(String where) {
		this.where = where;
		if(where != null){
			putQueryParameter("Where", where);
		}
	}

	public Long getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putQueryParameter("RuleId", ruleId.toString());
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public String getShortTopic() {
		return this.shortTopic;
	}

	public void setShortTopic(String shortTopic) {
		this.shortTopic = shortTopic;
		if(shortTopic != null){
			putQueryParameter("ShortTopic", shortTopic);
		}
	}

	@Override
	public Class<UpdateRuleResponse> getResponseClass() {
		return UpdateRuleResponse.class;
	}

}
