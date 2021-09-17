arr=[12,45,67,3,12]
print("Array:", arr)
n=int(input())
index=[x for x in range(len(arr)) if arr[x] == n]

print("index:",str(index))