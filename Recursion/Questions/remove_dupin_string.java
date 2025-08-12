public class remove_dupin_string {
    public static void removeduplicates(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx == str.length() - 1){
            System.out.println(newstr);
            return;
        }

        char currchar = str.charAt(idx);

        if(map[currchar - 'a'] == true){
            removeduplicates(str,idx+1,newstr,map); //duplicate
        }
        else{
            map[currchar -'a'] = true;
            removeduplicates(str,idx+1,newstr.append(currchar),map);
        }
    }
    public static void main(String args[]){
        String str = "appnnacollege";
        removeduplicates(str,0,new StringBuilder(""),new boolean [26]);

    }
}
