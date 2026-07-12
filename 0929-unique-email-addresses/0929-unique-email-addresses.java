class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        
        for (int i=0;i<emails.length;i++){
            String email=emails[i];
            int atIndex=email.indexOf('@');
            
            String local=email.substring(0,atIndex);
            String domain=email.substring(atIndex); 
            
            int plusIndex= local.indexOf('+');
            if(plusIndex!=-1){
                local=local.substring(0,plusIndex);
            }
            
            local=local.replace(".","");
            
            String cleanedEmail=local+domain;
            uniqueEmails.add(cleanedEmail);
        }
        
        return uniqueEmails.size();
    }
}