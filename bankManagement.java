
//la 1 ere question 
class compt{
    private double solde;
    public compt(){
    solde = 0.0;
    }
    public compt(double x){
        solde = x;
        }
        public double getSolde(){
        return solde;
        }
        public void crediter(double x){
        solde += x;
        }
        public void debiter(double x){
        solde -= x;
        }
        public void afficherSolde(){
            System.out.println(getSolde() + " dinar");
            }
            
            }
            //la  deuxieme question modifier le compte 
             public double solde ; 
    public class modifierCompte implements Runnable {
        public void run (){
            public void ajouterArgent (double mantant){
                solde=montant+solde;
            }
            public void retirerArgent (double mantant){
                soldeRtrait = solde -mantant;
            if (mantant < = debitMax and soldeRtrait <= decouvertMax and mantant > 0){
                solde = soldeRtrait;
                System.out.println("votre solde est "+solde);
            } else { 
                System.out.println('impossible de retirer largent );
            }   
            }

        }
        public static void main (string[]arg){
            modifierCampte com  = new modifierCompte();
            Thread t1 = new Thread(t1);
            t1.start();
            System.out.println('solde est '+solde);
        }
    }
    //question 3 cration d un compte et thread pour le modifier 
    public classe CreateUpdate implement Runnable {
        private String nom ;
        private String adresse;
        public void run(){
            for (int i= 0 ; i<10 ;i++){
                public void creatCount (int numCompt,String nomTitulaire ,String PrenomTitulaire){
                    super()
                    this.numCompt = numCompt;
                    this.nomTitulaire = nomTitulaire;
                    this.PrenomTitulaire= PrenomTitulaire;
                }
                creatCout.modifierCompte ();
                try {
                    Thread.sleep(500);
                }catch(InterrupledException){ e.printStacktrace();}

            }
        }
        public class demo {
            public static vois main (string[]args){
                Thread t1 = new Thread (new CreateUpdate ());
                Thread t2 = new Thread (new CreateUpdate ());
                Thread t3 = new Thread (new CreateUpdate ());
                Thread t4 = new Thread (new CreateUpdate ());
                Thread t5 = new Thread (new CreateUpdate ());
                Thread t6 = new Thread (new CreateUpdate ());
                Thread t7 = new Thread (new CreateUpdate ());
                t1.start();t2.start();t3.start();t4.start();t5.start();t6.start();t7.start();
            }
        }
    }

