class Solution {
    public String destCity(List<List<String>> paths) {
        List<String> startCity = new ArrayList<>();
        List<String> destCity = new ArrayList<>();

        for (List<String> path : paths) {
            startCity.add(path.get(0));
            destCity.add(path.get(1));
        }

        for (String city : destCity) {
            if (!startCity.contains(city)) {
                return city;
            }
        }

        return null;
    }
}
