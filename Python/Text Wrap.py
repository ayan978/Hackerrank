import textwrap

def wrap(string, max_width):
    string1 = ''
    s_length = len(string)
    for i in range(0,len(string),max_width):
       if (i+max_width) < s_length:
        string1 += string[i:i+max_width] +'\n'
       else:
        string1 += string[i:s_length]
        
    return string1


if __name__ == '__main__':
    string, max_width = input(), int(input())
    result = wrap(string, max_width)
    print(result)
