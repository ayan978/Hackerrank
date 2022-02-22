if __name__ == '__main__':
    N = int(input())
    list1 = []

    for i in range(N):
        s1 = input().split()

        if s1[0] == "insert":
            list1.insert(int(s1[1]), int(s1[2]))

        if s1[0] == "print":
            print(list1)

        if s1[0] == "remove":
            list1.remove(int(s1[1]))

        if s1[0] == "append":
            list1.append(int(s1[1]))

        if s1[0] == "sort":
            list1.sort()

        if s1[0] == "pop":
            list1.pop()

        if s1[0] == "reverse":
            list1.reverse()

