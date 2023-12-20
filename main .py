def merge(nums1, m, nums2, n):
    index1, index2, merged_index = m - 1, n - 1, m + n - 1
    while index1 >= 0 and index2 >= 0:
        nums1[merged_index] = max(nums1[index1], nums2[index2])
        index1, index2, merged_index = (
            index1 - (nums1[index1] > nums2[index2]),
            index2 - (nums1[index1] <= nums2[index2]),
            merged_index - 1,
        )
    nums1[:index2 + 1] = nums2[:index2 + 1]
# Case 1
nums1_1, m_1, nums2_1, n_1 = [1, 2, 3, 0, 0, 0], 3, [2, 5, 6], 3
merge(nums1_1, m_1, nums2_1, n_1)
print(nums1_1)
# Case 2
nums1_2, m_2, nums2_2, n_2 = [1], 1, [], 0
merge(nums1_2, m_2, nums2_2, n_2)
print(nums1_2)
# Case 3
nums1_3, m_3, nums2_3, n_3 = [0], 0, [1], 1
merge(nums1_3, m_3, nums2_3, n_3)
print(nums1_3)
