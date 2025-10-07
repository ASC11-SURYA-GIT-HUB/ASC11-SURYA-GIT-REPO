text = "Hello World"
other = "hello world"

print("\nIndexing:", text[0])  # H
print("Membership test:", "World" in text)  # True
print("Length:", len(text))  # 11
print("Find:", text.find("o"))  # 4
print("Equality:", text == other)  # False
print("Case-insensitive equality:", text.lower() == other.lower())  # True
print("Join:", "-".join(["a", "b", "c"]))  # a-b-c
print("rfind:", text.rfind("l"))  # 9
print("Slicing:", text[0:5])  # Hello
print("Lower:", text.lower())  # hello world
print("Upper:", text.upper())  # HELLO WORLD
print("Strip:", "  hello  ".strip())  # hello
