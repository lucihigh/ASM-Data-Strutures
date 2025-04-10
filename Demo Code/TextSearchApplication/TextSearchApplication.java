/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TextSearchApplication;

import java.util.Scanner;

/**
 *
 * @author P1
 */
public class TextSearchApplication {
    // Xây dựng từ điển thủ công từ dataset
    public static String[] buildVocabulary(String[] dataset) {
        String[] vocab = new String[1000];  // Tạo mảng chứa các từ, kích thước tối đa là 1000
        int index = 0;
        
        // Duyệt qua từng tài liệu trong dataset
        for (String doc : dataset) {
            String[] words = doc.split("\\s+");
            // Thêm từ vào từ điển nếu chưa có
            for (String word : words) {
                boolean exists = false;
                for (int i = 0; i < index; i++) {
                    if (vocab[i].equals(word)) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) {
                    vocab[index++] = word;
                }
            }
        }

        return vocab;
    }

    // Tính toán độ "gần" của query so với tài liệu (Sử dụng số từ chung)
    public static int calculateSimilarity(String query, String doc) {
        String[] queryWords = query.split("\\s+");
        String[] docWords = doc.split("\\s+");
        
        int commonWords = 0;
        
        // Đếm số từ chung giữa query và tài liệu
        for (String qWord : queryWords) {
            for (String dWord : docWords) {
                if (qWord.equals(dWord)) {
                    commonWords++;
                    break;
                }
            }
        }

        return commonWords;
    }

    // Tìm tài liệu gần nhất dựa trên độ "gần"
    public static String findClosestMatch(String query, String[] dataset) {
        int maxSimilarity = -1;
        String closestDoc = "";

        // Duyệt qua từng tài liệu trong dataset
        for (String doc : dataset) {
            int similarity = calculateSimilarity(query, doc);
            if (similarity > maxSimilarity) {
                maxSimilarity = similarity;
                closestDoc = doc;
            }
        }

        return closestDoc;
    }

    public static void main(String[] args) {
        String[] dataset = {
            "I love music", 
            "computer can play music", 
            "music is just music", 
            "computer can do everything", 
            "I love you"
        };
        
        // Xây dựng từ điển thủ công
        String[] vocab = buildVocabulary(dataset);
        
        // Nhập query từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your query: ");
        String query = scanner.nextLine();
        
        // Tìm tài liệu gần nhất và in ra kết quả
        String closestMatch = findClosestMatch(query, dataset);
        
        // In ra các từ vựng đã được chia bởi dấu phẩy
        String[] closestWords = closestMatch.split("\\s+");
        StringBuilder vocabOutput = new StringBuilder();
        for (int i = 0; i < closestWords.length; i++) {
            vocabOutput.append(closestWords[i]);
            if (i < closestWords.length - 1) {
                vocabOutput.append(", ");
            }
        }
        
        // In ra kết quả
        System.out.println("Closest matching document: " + closestMatch);
        System.out.println("Vocabulary: " + vocabOutput.toString());

        scanner.close();
    }
}
