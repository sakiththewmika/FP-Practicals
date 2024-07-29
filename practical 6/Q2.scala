import scala.io.StdIn._
object StudentRecords{
    def getStudentInfo() : (String, Int, Int, Double, Char) = {
        print("Enter student name : ");
        val name = readLine();
        print("Enter marks obtained : ");
        val marks = readInt();
        print("Enter total possible marks : ");
        val totalMarks = readInt();

        val percentage = (marks.toDouble / totalMarks) * 100;
        val grade = percentage match {
            case x if x >= 90 => 'A';
            case x if x >= 75 => 'B';
            case x if x >= 50 => 'C';
            case _ => 'D';
        }

        return (name, marks, totalMarks, percentage, grade);
    }

    def printStudentRecord(student : (String, Int, Int, Double, Char)) : Unit = {
        println("Student name : " + student._1);
        println("Marks obtained : " + student._2);
        println("Total possible marks : " + student._3);
        println(f"Percentage : ${student._4}%.2f");
        println("Grade : " + student._5);
    }

    def validateInput(name : String, marks : Int, totalMarks : Int) : (Boolean, Option[String]) = {
        if (name.isEmpty()) {
            return (false, Some("Name cannot be empty"));
        } else if (marks < 0 || marks > totalMarks) {
            return (false, Some("Marks should be positive and not exceed the total marks"));
        } else{
            return (true, None);
        }
    }

    def getStudentInfoWithRetry() : (String, Int, Int, Double, Char) = {
        var studentInfo = getStudentInfo();
        var (name, marks, totalMarks, _, _) = studentInfo;
        var (isValid, errorMessage) = validateInput(name, marks, totalMarks);

        while (!isValid) {
            println(errorMessage.get)
            studentInfo = getStudentInfo()
            val (newName, newMarks, newTotalMarks, _, _) = studentInfo
            val validation = validateInput(newName, newMarks, newTotalMarks)
            isValid = validation._1
            errorMessage = validation._2
        }

        return studentInfo;
    }

    def main(args : Array[String]) : Unit = {
        val student1 = getStudentInfoWithRetry();
        printStudentRecord(student1);
    }
}