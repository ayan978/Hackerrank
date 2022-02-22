if __name__ == '__main__':

    list1 = []
    for _ in range(int(input())):
        list2 = []
        name = input()
        score = float(input())
        list2.append(name)
        list2.append(score)
        list1.append(list2)

    list3 = []

    for i in list1:
        list3.append(i[1])

    s1 = set(list3)
    s1.remove(min(s1))

    names_list = []
    for i in list1:
        if i[1] == min(s1):
            names_list.append(i[0])

    names_list.sort()
    
    for i in names_list:
        print(i)
   
