class Solution:
    def reverse(self, x: int) -> int:
        if x>0:
            temp = str(x)
            ret = temp[::-1]
            if (-2)**31<=int(ret)<=(2**31 - 1):
                return int(ret)
            else:
                return 0
        else:
            y = x*(-1)
            temp = str(y) 
            ret = temp[::-1]
            if (-2)**31<=int(ret)*(-1)<=(2**31 - 1):
                return int(ret)*(-1)
            else:
                return 0
