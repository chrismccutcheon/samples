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


find_largest_diff(stocks)

permutation = ['a','b','c','d']

def permute_list(permutation, array):
    for i in range (len(array)):

