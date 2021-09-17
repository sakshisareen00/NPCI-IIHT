arr=[3,6,2,1,89,100,67]
temp=0
print("original array")
for i in range(0,len(arr)):
    print(arr[i])

for i in range(0,len(arr)):
    for j in range(i+1,len(arr)):
        if(arr[i]>arr[j]):
            temp=arr[i]
            arr[i]=arr[j]
            arr[j]=temp
print()

print("sorted array")
for i in range(0,len(arr)):
    print(arr[i])