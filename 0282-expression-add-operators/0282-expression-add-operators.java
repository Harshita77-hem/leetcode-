


class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>();

        solve(num, target, 0, "", 0, 0, ans);

        return ans;
    }

    public void solve(String num, int target, int index,
                      String path, long value, long last,
                      List<String> ans) {

        if (index == num.length()) {
            if (value == target) {
                ans.add(path);
            }
            return;
        }

        for (int i = index; i < num.length(); i++) {

            if (i > index && num.charAt(index) == '0') {
                break;
            }

            long current = Long.parseLong(
                num.substring(index, i + 1)
            );

            if (index == 0) {
                solve(num, target, i + 1,
                      path + current, current, current, ans);
            } else {
                solve(num, target, i + 1,
                      path + "+" + current,
                      value + current, current, ans);

                solve(num, target, i + 1,
                      path + "-" + current,
                      value - current, -current, ans);

                solve(num, target, i + 1,
                      path + "*" + current,
                      value - last + last * current,
                      last * current, ans);
            }
        }
    }
}

