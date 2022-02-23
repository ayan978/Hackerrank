def solve(s):
    list1 = s.split(' ')
    full_name = ''
    
    for i in list1:
        if i=='':
            full_name += ' '
        else:
            full_name += i[0].upper()
            for j in range(1,len(i)):
                full_name += i[j]
            full_name += ' '
    return full_name
        

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = solve(s)

    fptr.write(result + '\n')

    fptr.close()
