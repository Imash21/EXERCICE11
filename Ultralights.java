public class Ultralights
{
    public static void main(String[] args)
    {
        Simulation_57105 s = new Simulation_57105();
        for (int i = 0; i < 6; i++)
        {
            System.out.println(s);
            s.ChangeColor_57105();
        }
    }
}

enum Lights
{Black, Brown, Blue}

class Simulation_57105
{
    Lights Ls = Lights.Black;
    void ChangeColor_57105()
    {
        switch (Ls)
        {
            case Black :
                Ls=Lights.Brown;
                break;

            case Brown :
                Ls=Lights.Blue;
                break;

            case Blue :
                Ls=Lights.Black;
                break;
        }
    }

    public String toString()
    {return " "+Ls;}
}
