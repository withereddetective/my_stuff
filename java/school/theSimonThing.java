import java.util.ArrayList;
import java.util.Scanner;

public class theSimonThing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<ArrayList<String>> groups = new ArrayList<ArrayList<String >>();
        groups.add(new ArrayList<String>());
        
        int counter = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < counter; i++){
            
            String current_name = scan.next();
            String partner_with_space = scan.nextLine();
            String partner = partner_with_space.trim();
            
            for (int groupIndex = 0; groupIndex < groups.size(); groupIndex++){
                    
                if (groups.get(groupIndex).contains(current_name) && !(groups.get(groupIndex).contains(partner))) {
                    groups.get(groupIndex).add(partner);
                } else if(!(groups.get(groupIndex).contains(current_name)) && groups.get(groupIndex).contains(partner)) {
                    groups.get(groupIndex).add(current_name);
                }

                for (int otherGroupIndex = 0; groupIndex < groups.size(); otherGroupIndex++){

                    if (groups.get(groupIndex).contains(current_name) && groups.get(otherGroupIndex).contains(current_name)) {
                        groups.get(groupIndex).addAll(groups.get(otherGroupIndex));
                        groups.remove(otherGroupIndex);
                    }

                    if (groups.get(groupIndex).contains(partner) && groups.get(otherGroupIndex).contains(partner)) {
                        groups.get(groupIndex).addAll(groups.get(otherGroupIndex));
                        groups.remove(otherGroupIndex);
                    }

                }
                    
            }
            
        }
        
        for (int i = 0; i < groups.size(); i++) {
            groups.get(i).sort();
        }

        System.out.print(groups);

    }
}