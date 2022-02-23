def count_substring(string, sub_string):
    count = 0
    s_len = len(string)
    s_s_len = len(sub_string)
    for i in range((s_len-s_s_len)+1):
        string1 = ''
        count1 = i
        for j in range(len(sub_string)):
            string1 += string[count1]
            count1 += 1
        if string1 == sub_string:
            count += 1
            
    return count
if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    count = count_substring(string, sub_string)
    print(count)
