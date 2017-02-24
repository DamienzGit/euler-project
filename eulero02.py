p   = 1
s   = 2
tot = 0
n   = 0
while n<4000000:
    n = p+s
    p = s
    s = n
    print(n)
    if (n%2==0):
        print('Preso Pari:--------> {}'.format(n))
        tot += n
print("Somma",tot)
