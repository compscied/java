//Netflix gson parsing
//Based on http://techblog.netflix.com/2015/10/falcor-for-android.html
//https://netflix.github.io/falcor/
//Netflix Releases Falcor Developer Preview:
//http://techblog.netflix.com/2015/08/falcor-developer-preview.html

public class JsonExample
{
	// Custom deserialization method for Video.Summary model
	public void populate(JsonElement jsonElem) {
		JsonObject json = jsonElem.getAsJsonObject();	
		
		for (Map.Entry<String, JsonElement> entry : json.entrySet()) {
			JsonElement value = entry.getValue();
			
			switch (entry.getKey()){
			case "id": id = value.getAsString(); break;
			case "title": title = value.getAsString(); break;
			
			//more parsing logic...
			}
		}
	}
	
	private Result validate(Object o1, Object o2) {
		//...snipped...
		Class<?>[] validationInterfaces = INTERFACE_MAP.get(o1.getClass());
		
		Log.d(TAG, "Getting methods for interface: " + testingInterface);
		
		Method[] methods = testingInterface.getMethods(); // Public methods only
		
		for (Method method : methods) {
			Object rtn1 = method.invoke(o1); // Old cache object
            Object rtn2 = method.invoke(o2); // Falcor cache object
			
			if (rtn1 instanceof FalcorValidator) {
				Result rtn = validate(rtn1, rtn2); // Recursively validate objects
				
				if (rtn.isError()) {
                    return rtn;
                }
				else if( ! rtn1.equals(rtn2)) {
					return Result.VALUE_MISMATCH.append(rtnMsg);
				}
			}
			
			return Result.OK;
		}
		
	}	
	
	void doCacheDumpRecursive(StringBuilder output, BranchNode node, int offset) {
		StrinBuilder sb = new StrinBuilder();
		
		for(int i=0; i<offset; i++){
			sb.append((i==offset-1) ?  " |-" : " | "); // Indentation chars
		}
		
		String spacer = sb.toString();
		
		for (String key : keys){
			Object value = node.get(key);
			
			if(value instanceof Ref){
				output.append(spacer).append(key).append(" ->")
					.append(((Ref)value).getRefPath()).append(NEWLINE);
			}
			else {
            output.append(spacer).append(key).append(NEWLINE);
			}
			if(value instanceof BranchNode){
				doCacheDumpRecursive(output, (BranchNode) value, offset + 1);
			}
				
		}
		
	}
}