/**
 * 
 * HeartTransplant class
 * 
 * @author Ana Paula Centeno
 * @author Haolin (Daniel) Jin
 * Mychal Ortega
 * mlo77@scarletmail.rutgers.edu
 * mlo77
 */
public class HeartTransplant {

    // patient array, each Patient is read from the data file
    private Patient[] patients;

    // SurvivabilityByAge array, each rate is read from data file
    private SurvivabilityByAge survivabilityByAge;

    // SurvivabilityByCause array, each rate is read from data file
    private SurvivabilityByCause survivabilityByCause;

    /*
     * Default constructor
     * Initializes patients to null.
     * Initializes survivabilityByAge to null.
     * Initializes survivabilityByCause to null. 
     */
    public HeartTransplant() {
        patients = null;
        survivabilityByAge = null;
        survivabilityByCause = null;

        // WRITE YOUR CODE HERE
    }

    /*
     * Returns patients
     */
    public Patient[] getPatients() {

        // WRITE YOUR CODE HERE
        return patients;
     } 

    /*
     * Returns survivabilityByAge
     */
    public SurvivabilityByAge getSurvivabilityByAge() {
        // WRITE YOUR CODE HERE
        return survivabilityByAge;
    }

    /*
     * Returns survivabilityByCause
     */
    public SurvivabilityByCause getSurvivabilityByCause() {
        // WRITE YOUR CODE HERE
        return survivabilityByCause;
    }

    /*
     * 1) Initialize the instance variable patients array with numberOfLines length.
     * 
     * 2) Reads from the command line data file, use StdIn.readInt() to read an integer.
     *    File Format: 
     *      ID, ethnicity, Gender, Age, Cause, Urgency, State of health
     * 
     *    Each line refers to one Patient, all values are integers.
     * 
     */
    public void readPatients (int numberOfLines) {
        // WRITE YOUR CODE HERE 
        this.patients = new Patient[numberOfLines];
        int p[] = new int[7];

        for(int i = 0; i < numberOfLines; i++){
            for(int j = 0; j < 7; j++){
                p[j] =  StdIn.readInt();

            }
            Patient pat = new Patient(p[0], p[1],p[2],p[3],p[4],p[5],p[6]);
            this.patients[i] = pat;
        }
        

    }

    /*
     * 1) Initialize the instance variable survivabilityByAge with a new survivabilityByAge object.
     * 
     * 2) Reads from the command line file to populate the object. 
     *    Use StdIn.readInt() to read an integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Age YearsPostTransplant Rate
     *    Each line refers to one survivability rate by age.
     * 
     */
    public void readSurvivabilityByAge (int numberOfLines) {
        this.survivabilityByAge = new SurvivabilityByAge();



        for(int i = 0; i < numberOfLines; i++){
            int a = StdIn.readInt();
            int b = StdIn.readInt();
            double c = StdIn.readDouble();
            this.survivabilityByAge.addData(a, b, c);


        }
        // WRITE YOUR CODE HERE
    }

    /*
     * 1) Initialize the instance variable survivabilityByCause with a new survivabilityByCause object.
     * 
     * 2) Reads from the command line file to populate the object. Use StdIn.readInt() to read an 
     *    integer and StdIn.readDouble() to read a double.
     * 
     *    File Format: Cause YearsPostTransplant Rate
     *    Each line refers to one survivability rate by cause.
     * 
     */
    public void readSurvivabilityByCause (int numberOfLines) {
        // WRITE YOUR CODE HERE
        this.survivabilityByCause = new SurvivabilityByCause();

        for(int i = 0; i < numberOfLines; i++){
            int a = StdIn.readInt();
            int b = StdIn.readInt();
            double c = StdIn.readDouble();
            this.survivabilityByCause.addData(a, b, c);}
    }
    
    /*
     * Returns a Patient array containing the patients, 
     * from the patients array, that have age above the parameter age.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with age above the parameter age.
     * 
     * Return null if there is no Patient with age above the 
     * parameter age.
     */ 
    public Patient[] getPatientsWithAgeAbove(int age) {
        // WRITE YOUR CODE HERE
        
        int c = 0;
        for(int i = 0; i < getPatients().length; i++){
            if (patients[i].getAge() > age){
                c+= 1;
            }

        }
        Patient patAge[] = new Patient[c];
        int temp  = 0;
        for(int i =0; i < getPatients().length; i++){
            if (patients[i].getAge() >= age){
                patAge[temp] = patients[i];
                temp++;
            }

        }
        if (c > 0){
            return patAge;
        }
        else{
  
        return null;
    }
    }

    /*
     * Returns a Patient array containing the patients, from the patients array, 
     * that have the heart condition cause equal to the parameter cause.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the heart condition cause equal to the parameter cause.
     * 
     * Return null if there is no Patient with the heart condition cause 
     * equal to the parameter cause.
     */ 
    public Patient[] getPatientsByHeartConditionCause(int cause) {
        // WRITE YOUR CODE HERE
        int c = 0;
        for(int i = 0; i < getPatients().length; i++){
            if (patients[i].getCause() == cause){
                c+= 1;
            }

        }
        Patient patCause[] = new Patient[c];

        int temp  = 0;
        for(int i =0; i < getPatients().length; i++){
            if (patients[i].getCause() == cause){
                patCause[temp] = patients[i];
                temp++;
            }

        }

        
        if (c > 0){
            return patCause;
        }
        else{
  
        return null;}
    }

    /*
     * Returns a Patient array containing patients, from the patients array,
     * that have the state of health equal to the parameter state.
     * 
     * The return array has to be completely full with no empty
     * spots, that is the array size should be equal to the number
     * of Patients with the state of health equal to the parameter state.
     * 
     * Return null if there is no Patient with the state of health 
     * equal to the parameter state.
     */ 
    public Patient[] getPatientsByUrgency(int urgency) {

        // WRITE YOUR CODE HERE
        int c = 0;
	 for(int i = 0; i < getPatients().length; i++){
            if (patients[i].getUrgency() == urgency){
                c+= 1;
            }

        }
        Patient patUrg[] = new Patient[c];

        int temp  = 0;
        for(int i =0; i < getPatients().length; i++){
            if (patients[i].getUrgency() == urgency){
                patUrg[temp] = patients[i];
                temp++;
            }

        }

        
        if (c > 0){
            return patUrg;
        }
        else{
  
        return null;}
    }

    /*
     * Assume there is a heart available for transplantation surgery.
     * Also assume that the heart is of the same blood type as the
     * Patients on the patients array.
     * This method finds the Patient to be the recepient of this
     * heart.
     * 
     * The method returns a Patient from the patients array with
     * he highest potential for survivability after the transplant.
     * 
     * Assume the patient returned by this method will receive a heart,
     * therefore the Patient will no longer need a heart.
     * 
     * There is no correct solution, you may come up with any 
     * function to find the patient with the highest potential 
     * for survivability after the transplant.
     */ 
    public Patient getPatientForTransplant () {


	// WRITE YOUR CODE HERE

        
        return this.patients[patients.length-1];
	//return null;
    }
}
