import java.util.ArrayList;

public class ArrayListTest
    {
        public static void main(String[] args)
        {
            ArrayList<String> names = new ArrayList<String>();
            names.add("Jamal");
            names.add("Emily");
            names.add("Destiny");
            names.add("Mateo");

            //COMPLETE ME: print each name using an index based for loop
            for (int i = 0; i < names.size(); i++)
            {
                System.out.println(names.get(i));
            }
            //COMPLETE ME: print each name (again!) using enhanced for loop
            for (String name: name)
            {
                System.out.println(name);
            }
            //COMPLETE ME: print each name (a third time!) using a while loop
            int i = 0;
            while (i < names.size())
                    {
                        System.out.println(names.get(i));
                        i++;
                    }
        }
    }

