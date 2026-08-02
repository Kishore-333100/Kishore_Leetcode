class Solution {
    public String smallestPalindrome(String s) {
        
    int[] frequency = new int[26];
for (char ch : s.toCharArray()) {
    frequency[ch - 'a']++;
}

StringBuilder left = new StringBuilder();
String middle = "";

for (int i = 0; i < 26; i++) {
    if (frequency[i] % 2 == 1) {
        middle = String.valueOf((char)('a' + i));
    }
    for (int j = 0; j < frequency[i] / 2; j++) {
        left.append((char)('a' + i));
    }
}

String result = left.toString() + middle + left.reverse().toString();
return result; 
    } 
} 