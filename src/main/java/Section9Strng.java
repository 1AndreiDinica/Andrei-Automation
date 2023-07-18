public class Section9Strng {


        public static void main (String[] args) {

            String courseName = "Learn Java for Beginners Crash Course";
//            String message = "Welcome to";
//
////            //concatenate
////            String fullMessage = message + courseName;
////            System.out.println(fullMessage);
////
////            // use string format
////            String fullMessage2 = String.format("%s%s", message, courseName);
////            System.out.println(fullMessage2);
////
////            //use printf
////            System.out.printf("Hello, and %s the %s.%n",message, courseName);
////
////            for( int i = 0; i<37; i++  )
////            {
////                char character = courseName.charAt(i);
////                System.out.println(character);
////            }
//
//
//            System.out.println(courseName.charAt(0));
//            System.out.println((courseName.charAt(6)));
//
//            for (int i = 15 ; i < courseName.length(); i++) {
//                System.out.print( courseName.charAt(i));
//            }
//            System.out.println();
//            System.out.println(courseName.length());

            int position = -1;


            //     position = indexOfI
//              position = indexOfIgnoreCase(courseName, " c", 0);
//              System.out.println(position);
            do {
                position = indexOfIgnoreCase(courseName, " c", position + 1);
                //           position = courseName.lastIndexOf(" C");
                if (position != -1 ) {
                    courseName = replaceByIndex(courseName, position, " c".length(), " Java");
                    System.out.println(courseName);
                }
 //               System.out.println(position);
            } while (position != -1);

            String fixedString = courseName.replace("Java", "C");
            System.out.println(fixedString);
        }


            private static String replaceByIndex(String original, int start, int length, String replacement){
            String toRemove = original.substring(start, start+ length);
            return original.replaceFirst(toRemove, replacement);
            }


            private static int indexOfIgnoreCase(String text, String searchText, int fromIndex) {
                String textLowerCase = text.toLowerCase();
                String searchTextLowerCase = searchText.toLowerCase();
                return textLowerCase.indexOf(searchTextLowerCase, fromIndex);

            }

        }


