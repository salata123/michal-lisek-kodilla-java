package com.kodilla.stream;                                                   // [1]

import com.kodilla.stream.lambda.Executor;                                    // [2]
import com.kodilla.stream.lambda.Processor;                                   // [3]

public class StreamMain {                                                     // [4]

    public static void main(String[] args) {                                   // [5]
        Processor processor = new Processor();                                  // [6]
        Executor codeToExecute = () -> System.out.println("This is an example text!");  // [7]
        processor.execute(codeToExecute);                                       // [8]
    }
}