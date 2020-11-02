package com.example.quizmaniac;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultQuestionAdapter extends RecyclerView.Adapter<ResultQuestionAdapter.ViewHolder>
{
    private ArrayList<Question> categoryQuestions;
    private char[] optionMarked;
    private int[] questionNumbers;

    public ResultQuestionAdapter(Context context, ArrayList<Question> list, char[] marked, int[] quesNum)
    {
        categoryQuestions = list;
        optionMarked = marked;
        questionNumbers = quesNum;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tvAskedQuestion, tvCorrectAnswer;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvAskedQuestion = itemView.findViewById(R.id.tvAskedQuestion);
            tvCorrectAnswer = itemView.findViewById(R.id.tvCorrectAnswer);
        }
    }

    @NonNull
    @Override
    public ResultQuestionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ResultQuestionAdapter.ViewHolder viewHolder, int i) {

        viewHolder.itemView.setTag(categoryQuestions.get(questionNumbers[i]));

        viewHolder.tvAskedQuestion.setText(String.format("Q. %s", categoryQuestions.get(questionNumbers[i]).getQuestion()));

        if(categoryQuestions.get(questionNumbers[i]).getAnswer() == 'A')
            viewHolder.tvCorrectAnswer.setText(categoryQuestions.get(questionNumbers[i]).getA());
        else if(categoryQuestions.get(questionNumbers[i]).getAnswer() == 'B')
            viewHolder.tvCorrectAnswer.setText(categoryQuestions.get(questionNumbers[i]).getB());
        else if(categoryQuestions.get(questionNumbers[i]).getAnswer() == 'C')
            viewHolder.tvCorrectAnswer.setText(categoryQuestions.get(questionNumbers[i]).getC());
        else
            viewHolder.tvCorrectAnswer.setText(categoryQuestions.get(questionNumbers[i]).getD());

    }

    @Override
    public int getItemCount() {
        return questionNumbers.length;
    }
}
