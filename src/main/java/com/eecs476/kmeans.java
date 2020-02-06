package com.eecs476

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;

public class kmeans {

    // template arguments are <input key, input value, output key, output value>
    public static class MyMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

        public void map(LongWritable key, Text text, Mapper.Context context) {
            // TODO: this is a sample declaration fo a mapper
            // you will need to implement this and add any additional mappers

        }
    }

    // template arguments are <input key, input value, output key, output value>
    public static class MyReducer extends Reducer<Text, IntWritable, Text, IntWritable> {

        public void reduce(Text key, Iterable<IntWritable> values, Context context) {
            // TODO: this is a sample declaration fo a reducer
            // you will need to implement this and add any additional reducers
        }
    }


    public static void main(String[] args) {
        System.out.println("Setup your jobs here!");
    }

}
