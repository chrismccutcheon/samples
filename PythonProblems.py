__author__ = 'ChrisMcC'

stocks = [515, 280, 290, 400, 345, 415]

def find_largest_diff(stocklist):
    minimum = stocklist[0]
    curdiff = 0;
    maxdiff = 0;
    maxval = 0;
    diffs = []
    for i in stocklist:
        if (i < minimum):
            minimum = i
        curdiff = i - minimum
        if curdiff > maxdiff:
            maxdiff = curdiff
            maxval = i
    print(minimum)
    print(maxval)
    print(maxdiff)

#find_largest_diff(stocks)

#permutation = ['a','b','c','d']

#def permute_list(permutation, array):
    #for i in range (len(array)):


# Take characters and convert them to numbers
# A is 1 AA is 27  and ZZ is 702
def spreadsheetnumbersystem(chars):
    letterlist = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y','Z']
    sum = 0
    if(len(chars) < 2):
        for i in range (len(letterlist)):
            if(chars[0] == letterlist[i]):
                sum = i + 1
    if(len(chars) >= 2):
        for k in range (len(chars)-1, -1, -1):
            for i in range (len(letterlist)):
                if(chars[k] == letterlist[i]):
                    if(k > 0):
                        sum = 26 * (i + 1)
                    if(k == 0):
                        sum = sum + i + 1
    print (sum)


spreadsheetnumbersystem("ZZ")