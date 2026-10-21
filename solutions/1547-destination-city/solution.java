class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> set = new HashSet<>();
        // Add all destination cities to the set
        for (List<String> path : paths) {
            set.add(path.get(1));
        }
        // Remove all starting cities from the set
        for (List<String> path : paths) {
            set.remove(path.get(0));
        }
        for (String city : set) {
            return city;
        }
        return "";
    }
}
