public class Nota {
    int id;
    String N1;
    String N2;
    String N3;
    String N4;
    String N5;
    String N6;
   
        
    public double notaMedia(){
        double n1 = Double.parseDouble(N1);
        double n2 = Double.parseDouble(N2);
        double n3 = Double.parseDouble(N3);
        double n4 = Double.parseDouble(N4);
        double n5 = Double.parseDouble(N5);
        double n6 = Double.parseDouble(N6);
        return (n1 + n2 + n3 + n4 + n5 + n6) / 6;

    }
   
   
   
    @Override
    public String toString() {
        return "Nota [N1=" + N1 + ", N2=" + N2 + ", N3=" + N3 + ", N4=" + N4 + ", N5=" + N5 + ", N6=" + N6 + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((N1 == null) ? 0 : N1.hashCode());
        result = prime * result + ((N2 == null) ? 0 : N2.hashCode());
        result = prime * result + ((N3 == null) ? 0 : N3.hashCode());
        result = prime * result + ((N4 == null) ? 0 : N4.hashCode());
        result = prime * result + ((N5 == null) ? 0 : N5.hashCode());
        result = prime * result + ((N6 == null) ? 0 : N6.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Nota other = (Nota) obj;
        if (N1 == null) {
            if (other.N1 != null)
                return false;
        } else if (!N1.equals(other.N1))
            return false;
        if (N2 == null) {
            if (other.N2 != null)
                return false;
        } else if (!N2.equals(other.N2))
            return false;
        if (N3 == null) {
            if (other.N3 != null)
                return false;
        } else if (!N3.equals(other.N3))
            return false;
        if (N4 == null) {
            if (other.N4 != null)
                return false;
        } else if (!N4.equals(other.N4))
            return false;
        if (N5 == null) {
            if (other.N5 != null)
                return false;
        } else if (!N5.equals(other.N5))
            return false;
        if (N6 == null) {
            if (other.N6 != null)
                return false;
        } else if (!N6.equals(other.N6))
            return false;
        return true;
    }
    public Nota(String n1, String n2, String n3, String n4, String n5, String n6) {
            N1 = n1;
            N2 = n2;
            N3 = n3;
            N4 = n4;
            N5 = n5;
            N6 = n6;
        }
    
        public String getN1() {
        return N1;
    }
    public void setN1(String n1) {
        N1 = n1;
    }
    public String getN2() {
        return N2;
    }
    public void setN2(String n2) {
        N2 = n2;
    }
    public String getN3() {
        return N3;
    }
    public void setN3(String n3) {
        N3 = n3;
    }
    public String getN4() {
        return N4;
    }
    public void setN4(String n4) {
        N4 = n4;
    }
    public String getN5() {
        return N5;
    }
    public void setN5(String n5) {
        N5 = n5;
    }
    public String getN6() {
        return N6;
    }
    public void setN6(String n6) {
        N6 = n6;
    }
    
    
}
