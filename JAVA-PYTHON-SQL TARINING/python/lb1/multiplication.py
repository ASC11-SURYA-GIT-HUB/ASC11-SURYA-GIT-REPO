def table_for(n):
    for i in range(1, 11):
        print(f"{n} x {i} = {n * i}")

def table_while(n):
    i = 1
    while i <= 10:
        print(f"{n} x {i} = {n * i}")
        i += 1

def table_do_while(n):
    i = 1
    while True:
        print(f"{n} x {i} = {n * i}")
        i += 1
        if i > 10:
            break

# Test
print("\nMultiplication Table (for loop):")
table_for(2)
print("\nMultiplication Table (while loop):")
table_while(2)
print("\nMultiplication Table (do-while simulation):")
table_do_while(2)
