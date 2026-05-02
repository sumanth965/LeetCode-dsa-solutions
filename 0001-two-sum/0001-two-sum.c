#include <stdio.h>
#include <stdlib.h>

#define TABLE_SIZE 10007  // a prime number for better distribution

// Node for chaining
typedef struct Node {
    int key;    // number
    int value;  // index
    struct Node* next;
} Node;

// Hash table
Node* table[TABLE_SIZE];

// Hash function
int hash(int key) {
    if (key < 0) key = -key;
    return key % TABLE_SIZE;
}

// Insert into hash table
void insert(int key, int value) {
    int idx = hash(key);
    Node* newNode = (Node*)malloc(sizeof(Node));
    newNode->key = key;
    newNode->value = value;
    newNode->next = table[idx];
    table[idx] = newNode;
}

// Find value by key
Node* find(int key) {
    int idx = hash(key);
    Node* curr = table[idx];
    while (curr) {
        if (curr->key == key)
            return curr;
        curr = curr->next;
    }
    return NULL;
}

// Two Sum function
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    // Initialize table
    for (int i = 0; i < TABLE_SIZE; i++) {
        table[i] = NULL;
    }

    int* result = (int*)malloc(2 * sizeof(int));

    for (int i = 0; i < numsSize; i++) {
        int complement = target - nums[i];
        Node* node = find(complement);

        if (node != NULL) {
            result[0] = node->value;
            result[1] = i;
            *returnSize = 2;
            return result;
        }

        insert(nums[i], i);
    }

    *returnSize = 0;
    return NULL;
}