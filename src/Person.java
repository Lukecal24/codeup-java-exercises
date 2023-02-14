
public class Person {

        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName(){
    //TODO: return the person's name
                return name;
        }

        public void setName(String name){
    //TODO: change the name field to the passed value
                this.name = name;
        }
        public void sayHello(){
    //TODO: print a message to the console using the person's name
                System.out.println("Hello " + name);
        }

        public static void main(String[] args){

                Person person1 = new Person("Luke");

                // Test getName() method
                System.out.println(person1.getName()); // Output: Luke

                // Test setName() method
                person1.setName("Beno");
                System.out.println(person1.getName()); // Output: Beno

                // Test sayHello() method
                person1.sayHello(); // Output: Hello, my name is Beno
        }


}



