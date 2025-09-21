import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

class EventSecurity {
    private HashSet<String> vipList = new HashSet<>(Arrays.asList("Alice", "Bob", "Charlie"));
    /**
     * TO-DO: Check if the attendee list contains anyone NOT in the vipList.
     * \*
     *
     * @param attendees A list of names to check.
     * @return true if a non-VIP is found, false if all attendees are VIPs.
     */
    public boolean containsNonVip(List<String> attendees) {
        for (String attendee : attendees) {
            if (!vipList.contains(attendee)) {
                return true;
            }
        }
        return false;
    }
}