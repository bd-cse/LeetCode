class Solution {
    public boolean isValid(String s) {
        Stack<Character> leftPars = new Stack<>();
        Map<Character, Character> validPars = new HashMap<>();
        validPars.put(')', '(');
        validPars.put(']', '[');
        validPars.put('}', '{');

        for (Character ch : s.toCharArray()) {
            if (ch.equals('(') || ch.equals('[') || ch.equals('{')) {
                leftPars.push(validPars.get(ch));
            } else {
                if (leftPars.isEmpty()) {
                    return false;
                } else {
                    if (!leftPars.pop().equals(ch)) {
                        return false;
                    }
                }
            }
        }
        if (leftPars.isEmpty()) {
            return true;
        }
        return false;
    }
}