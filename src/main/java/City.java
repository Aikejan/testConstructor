public class City {
   private   String name;
  private    long population;
  private    double aree;
   private   String language;
   private   String majorOfCity;
  // private   String[] districtsn = new String[]{"kelechek","alaya","Alga "};

    public City(String name, Long population, double aree, String language, String majorOfCity) {
        this.name = name;
        this.population = population;
        this.aree = aree;
        this.language = language;
        this.majorOfCity = majorOfCity;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public double getAree() {
        return aree;
    }

    public void setAree(double aree) {
        this.aree = aree;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMajorOfCity() {
        return majorOfCity;
    }

    public void setMajorOfCity(String majorOfCity) {
        this.majorOfCity = majorOfCity;
    }

    }





