def largest_number(a, b, c):
    if a >= b and a >= c:
        return a
    elif b >= c:
        return b
    else:
        return c

# Test
print("\n------ LARGEST NUMBER ------")
print("Largest of (15, 22, 13):", largest_number(15, 22, 13))
