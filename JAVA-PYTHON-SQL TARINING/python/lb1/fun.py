def add(*args):
    if all(isinstance(arg, (int, float)) for arg in args):
        return sum(args)
    else:
        return " ".join(str(arg) for arg in args)

# Test cases
print(add(10, 20))         # → 30
print(add(10, 20, 30))     # → 60
print(add(10.5, 20.1))     # → 30.6
print(add("Hello", 20))    # → "Hello 20"
