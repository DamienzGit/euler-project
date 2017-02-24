num = 600851475143
i = 2
while i * i < num:
     print("i-->", i)
     while num % i == 0:
         print("dividing {}/{}".format(num,i))
         num = num / i
     i = i + 1
print(num)
