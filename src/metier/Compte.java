package metier;

public class Compte {

    // Properties
    private String numero;
    private double solde;
    private double decouvertmax;
    private double adevoir;

    // Accesseurs/Mutateurs

    public String getNumero()
    {
        return this.numero;
    }

    public void setNumero(String numero)
    {
        this.numero = numero;
    }

    public double getSolde()
    {
        return this.solde;
    }

    public void setSolde(double solde)
    {
        if(solde >= this.decouvertmax)
        {
            this.solde = solde;
        }
        else
        {
            System.out.println("Refuser !");
        }
    }

    public double getDecouvertMax()
    {
        return this.decouvertmax;
    }

    public void setDecouvertMax(double dmax)
    {
        this.decouvertmax = dmax;
    }

    // Methodes

    public void verser(double montant)
    {
        double solde;
        solde = getSolde() + montant;
        setSolde(solde);
    }

    public void retirer(double montant)
    {
        setSolde((getSolde() - montant));
    }

    public void virer(double montant, Compte compteAVirer)
    {
        retirer(montant);
        compteAVirer.verser(montant);
    }

    public Compte()
    {
        setDecouvertMax(50.0);
    }

    public Compte(String numero, double solde)
    {
        setNumero(numero);
        setSolde(solde);
        setDecouvertMax(50.0);
    }
}
