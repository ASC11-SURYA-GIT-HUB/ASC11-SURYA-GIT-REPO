def print_digits_in_words(number):
    if not (100 <= number <= 999):
        print("Please enter a three-digit number.")
        return
    
    digit_words = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]

    print("\n------ DIGITS IN WORDS ------")
    for digit in str(number):
        print(digit_words[int(digit)])

# Test
print_digits_in_words(745)
